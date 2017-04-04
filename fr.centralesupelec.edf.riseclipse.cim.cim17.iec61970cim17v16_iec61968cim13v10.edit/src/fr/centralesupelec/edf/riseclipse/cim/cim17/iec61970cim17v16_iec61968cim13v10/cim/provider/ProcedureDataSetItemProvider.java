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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProcedureDataSet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcedureDataSetItemProvider extends DocumentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcedureDataSetItemProvider( AdapterFactory adapterFactory ) {
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

            addCompletedDateTimePropertyDescriptor( object );
            addAssetPropertyDescriptor( object );
            addMeasurementValuePropertyDescriptor( object );
            addProcedurePropertyDescriptor( object );
            addWorkTaskPropertyDescriptor( object );
            addPropertiesPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Completed Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCompletedDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProcedureDataSet_completedDateTime_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProcedureDataSet_completedDateTime_feature",
                        "_UI_ProcedureDataSet_type" ),
                CimPackage.eINSTANCE.getProcedureDataSet_CompletedDateTime(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Asset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProcedureDataSet_Asset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ProcedureDataSet_Asset_feature",
                                "_UI_ProcedureDataSet_type" ),
                        CimPackage.eINSTANCE.getProcedureDataSet_Asset(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Measurement Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeasurementValuePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProcedureDataSet_MeasurementValue_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProcedureDataSet_MeasurementValue_feature",
                        "_UI_ProcedureDataSet_type" ),
                CimPackage.eINSTANCE.getProcedureDataSet_MeasurementValue(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Procedure feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProcedurePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProcedureDataSet_Procedure_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ProcedureDataSet_Procedure_feature",
                                "_UI_ProcedureDataSet_type" ),
                        CimPackage.eINSTANCE.getProcedureDataSet_Procedure(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Work Task feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWorkTaskPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProcedureDataSet_WorkTask_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ProcedureDataSet_WorkTask_feature",
                                "_UI_ProcedureDataSet_type" ),
                        CimPackage.eINSTANCE.getProcedureDataSet_WorkTask(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Properties feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPropertiesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProcedureDataSet_Properties_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ProcedureDataSet_Properties_feature",
                                "_UI_ProcedureDataSet_type" ),
                        CimPackage.eINSTANCE.getProcedureDataSet_Properties(), true, false, true, null, null, null ) );
    }

    /**
     * This returns ProcedureDataSet.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ProcedureDataSet" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ProcedureDataSet ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ProcedureDataSet_type" )
                : getString( "_UI_ProcedureDataSet_type" ) + " " + label;
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

        switch( notification.getFeatureID( ProcedureDataSet.class ) ) {
        case CimPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
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

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText( Object owner, Object feature, Object child, Collection< ? > selection ) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == CimPackage.eINSTANCE.getDocument_DocStatus()
                || childFeature == CimPackage.eINSTANCE.getDocument_Status();

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
