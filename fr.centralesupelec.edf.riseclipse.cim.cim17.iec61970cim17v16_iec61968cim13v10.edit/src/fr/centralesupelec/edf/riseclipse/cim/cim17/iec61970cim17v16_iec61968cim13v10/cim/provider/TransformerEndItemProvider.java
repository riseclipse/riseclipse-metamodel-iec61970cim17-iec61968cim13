/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformerEndItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformerEndItemProvider( AdapterFactory adapterFactory ) {
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

            addBmagSatPropertyDescriptor( object );
            addEndNumberPropertyDescriptor( object );
            addGroundedPropertyDescriptor( object );
            addMagBaseUPropertyDescriptor( object );
            addMagSatFluxPropertyDescriptor( object );
            addRgroundPropertyDescriptor( object );
            addXgroundPropertyDescriptor( object );
            addToMeshImpedancePropertyDescriptor( object );
            addTerminalPropertyDescriptor( object );
            addCoreAdmittancePropertyDescriptor( object );
            addBaseVoltagePropertyDescriptor( object );
            addRatioTapChangerPropertyDescriptor( object );
            addStarImpedancePropertyDescriptor( object );
            addFromMeshImpedancePropertyDescriptor( object );
            addPhaseTapChangerPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Bmag Sat feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBmagSatPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_bmagSat_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_bmagSat_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_BmagSat(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_endNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_endNumber_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_EndNumber(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Grounded feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGroundedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_grounded_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_grounded_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_Grounded(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mag Base U feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMagBaseUPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_magBaseU_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_magBaseU_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_MagBaseU(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mag Sat Flux feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMagSatFluxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_magSatFlux_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_magSatFlux_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_MagSatFlux(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rground feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRgroundPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_rground_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_rground_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_Rground(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xground feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXgroundPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_xground_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_xground_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_Xground(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the To Mesh Impedance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addToMeshImpedancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_ToMeshImpedance_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_ToMeshImpedance_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_ToMeshImpedance(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Terminal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTerminalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_Terminal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_Terminal_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_Terminal(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Core Admittance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoreAdmittancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_CoreAdmittance_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_CoreAdmittance_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_CoreAdmittance(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Base Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBaseVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_BaseVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_BaseVoltage_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_BaseVoltage(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ratio Tap Changer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatioTapChangerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_RatioTapChanger_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_RatioTapChanger_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_RatioTapChanger(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Star Impedance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStarImpedancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_StarImpedance_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_StarImpedance_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_StarImpedance(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the From Mesh Impedance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFromMeshImpedancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_FromMeshImpedance_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_FromMeshImpedance_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_FromMeshImpedance(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Phase Tap Changer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhaseTapChangerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TransformerEnd_PhaseTapChanger_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEnd_PhaseTapChanger_feature",
                                "_UI_TransformerEnd_type" ),
                        CimPackage.eINSTANCE.getTransformerEnd_PhaseTapChanger(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns TransformerEnd.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/TransformerEnd" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( TransformerEnd ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_TransformerEnd_type" )
                : getString( "_UI_TransformerEnd_type" ) + " " + label;
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

        switch( notification.getFeatureID( TransformerEnd.class ) ) {
        case CimPackage.TRANSFORMER_END__BMAG_SAT:
        case CimPackage.TRANSFORMER_END__END_NUMBER:
        case CimPackage.TRANSFORMER_END__GROUNDED:
        case CimPackage.TRANSFORMER_END__MAG_BASE_U:
        case CimPackage.TRANSFORMER_END__MAG_SAT_FLUX:
        case CimPackage.TRANSFORMER_END__RGROUND:
        case CimPackage.TRANSFORMER_END__XGROUND:
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
