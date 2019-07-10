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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationEventItemProvider extends ActivityRecordItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigurationEventItemProvider( AdapterFactory adapterFactory ) {
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

            addEffectiveDateTimePropertyDescriptor( object );
            addModifiedByPropertyDescriptor( object );
            addRemarkPropertyDescriptor( object );
            addChangedServiceCategoryPropertyDescriptor( object );
            addChangedDocumentPropertyDescriptor( object );
            addChangedUsagePointPropertyDescriptor( object );
            addChangedPersonRolePropertyDescriptor( object );
            addChangedAssetPropertyDescriptor( object );
            addChangedOrganisationRolePropertyDescriptor( object );
            addChangedLocationPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Effective Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEffectiveDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConfigurationEvent_effectiveDateTime_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConfigurationEvent_effectiveDateTime_feature",
                        "_UI_ConfigurationEvent_type" ),
                CimPackage.eINSTANCE.getConfigurationEvent_EffectiveDateTime(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Modified By feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModifiedByPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConfigurationEvent_modifiedBy_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConfigurationEvent_modifiedBy_feature",
                        "_UI_ConfigurationEvent_type" ),
                CimPackage.eINSTANCE.getConfigurationEvent_ModifiedBy(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Remark feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemarkPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ConfigurationEvent_remark_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ConfigurationEvent_remark_feature",
                                "_UI_ConfigurationEvent_type" ),
                        CimPackage.eINSTANCE.getConfigurationEvent_Remark(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Changed Service Category feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChangedServiceCategoryPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConfigurationEvent_ChangedServiceCategory_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ConfigurationEvent_ChangedServiceCategory_feature", "_UI_ConfigurationEvent_type" ),
                CimPackage.eINSTANCE.getConfigurationEvent_ChangedServiceCategory(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Changed Document feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChangedDocumentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConfigurationEvent_ChangedDocument_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConfigurationEvent_ChangedDocument_feature",
                        "_UI_ConfigurationEvent_type" ),
                CimPackage.eINSTANCE.getConfigurationEvent_ChangedDocument(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Changed Usage Point feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChangedUsagePointPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConfigurationEvent_ChangedUsagePoint_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConfigurationEvent_ChangedUsagePoint_feature",
                        "_UI_ConfigurationEvent_type" ),
                CimPackage.eINSTANCE.getConfigurationEvent_ChangedUsagePoint(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Changed Person Role feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChangedPersonRolePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConfigurationEvent_ChangedPersonRole_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConfigurationEvent_ChangedPersonRole_feature",
                        "_UI_ConfigurationEvent_type" ),
                CimPackage.eINSTANCE.getConfigurationEvent_ChangedPersonRole(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Changed Asset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChangedAssetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConfigurationEvent_ChangedAsset_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConfigurationEvent_ChangedAsset_feature",
                        "_UI_ConfigurationEvent_type" ),
                CimPackage.eINSTANCE.getConfigurationEvent_ChangedAsset(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Changed Organisation Role feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChangedOrganisationRolePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConfigurationEvent_ChangedOrganisationRole_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ConfigurationEvent_ChangedOrganisationRole_feature", "_UI_ConfigurationEvent_type" ),
                CimPackage.eINSTANCE.getConfigurationEvent_ChangedOrganisationRole(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Changed Location feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChangedLocationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConfigurationEvent_ChangedLocation_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConfigurationEvent_ChangedLocation_feature",
                        "_UI_ConfigurationEvent_type" ),
                CimPackage.eINSTANCE.getConfigurationEvent_ChangedLocation(), true, false, true, null, null, null ) );
    }

    /**
     * This returns ConfigurationEvent.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ConfigurationEvent" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ConfigurationEvent ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ConfigurationEvent_type" )
                : getString( "_UI_ConfigurationEvent_type" ) + " " + label;
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

        switch( notification.getFeatureID( ConfigurationEvent.class ) ) {
        case CimPackage.CONFIGURATION_EVENT__EFFECTIVE_DATE_TIME:
        case CimPackage.CONFIGURATION_EVENT__MODIFIED_BY:
        case CimPackage.CONFIGURATION_EVENT__REMARK:
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
