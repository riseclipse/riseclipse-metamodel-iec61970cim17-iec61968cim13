/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseVoltage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseVoltage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseVoltageItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseVoltageItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addNominalVoltagePropertyDescriptor( object );
            addVoltageLevelPropertyDescriptor( object );
            addTopologicalNodePropertyDescriptor( object );
            addTransformerEndsPropertyDescriptor( object );
            addNetworkAssetDeploymentPropertyDescriptor( object );
            addConductingEquipmentPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Nominal Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNominalVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_BaseVoltage_nominalVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BaseVoltage_nominalVoltage_feature",
                                "_UI_BaseVoltage_type" ),
                        CimPackage.eINSTANCE.getBaseVoltage_NominalVoltage(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Voltage Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVoltageLevelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_BaseVoltage_VoltageLevel_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BaseVoltage_VoltageLevel_feature",
                                "_UI_BaseVoltage_type" ),
                        CimPackage.eINSTANCE.getBaseVoltage_VoltageLevel(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Topological Node feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTopologicalNodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_BaseVoltage_TopologicalNode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BaseVoltage_TopologicalNode_feature",
                                "_UI_BaseVoltage_type" ),
                        CimPackage.eINSTANCE.getBaseVoltage_TopologicalNode(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Transformer Ends feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransformerEndsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_BaseVoltage_TransformerEnds_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BaseVoltage_TransformerEnds_feature",
                                "_UI_BaseVoltage_type" ),
                        CimPackage.eINSTANCE.getBaseVoltage_TransformerEnds(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Network Asset Deployment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNetworkAssetDeploymentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_BaseVoltage_NetworkAssetDeployment_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_BaseVoltage_NetworkAssetDeployment_feature",
                        "_UI_BaseVoltage_type" ),
                CimPackage.eINSTANCE.getBaseVoltage_NetworkAssetDeployment(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Conducting Equipment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConductingEquipmentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_BaseVoltage_ConductingEquipment_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_BaseVoltage_ConductingEquipment_feature",
                                "_UI_BaseVoltage_type" ),
                        CimPackage.eINSTANCE.getBaseVoltage_ConductingEquipment(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns BaseVoltage.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/BaseVoltage" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( BaseVoltage ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_BaseVoltage_type" )
                : getString( "_UI_BaseVoltage_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( BaseVoltage.class ) ) {
        case CimPackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
